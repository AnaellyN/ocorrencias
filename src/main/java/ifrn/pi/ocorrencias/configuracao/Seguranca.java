package ifrn.pi.ocorrencias.configuracao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class Seguranca {
	@Autowired
	private UserDetailsService detailsService;

	@Bean
	public static PasswordEncoder passwordencoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity httpSecurity)throws Exception {
		httpSecurity.csrf().disable()
			.authorizeRequests()
			.antMatchers("/", "/registro/**").permitAll()
			.antMatchers("/socorro").hasRole("ADMIN")
			.and()
			.formLogin(form -> form
					.loginPage("/login")
					.loginProcessingUrl("/login")
					.defaultSuccessUrl("/")
					.permitAll());
		return httpSecurity.build();
	}
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder authenticationManagerBuilder)throws Exception{
		authenticationManagerBuilder.userDetailsService(detailsService).passwordEncoder(passwordencoder());
	}
}
