package br.com.ecommerce.ecommerce.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import br.com.ecommerce.ecommerce.repository.UsuarioRepository;


@EnableWebSecurity
@Configuration
public class SecurityConfigurations extends WebSecurityConfigurerAdapter {

	@Autowired
	private AutenticacaoService autenticacaoService;
	
	@Autowired
	private TokenService tokenService;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	 private final BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
	
	@Override
	@Bean
	protected AuthenticationManager authenticationManager() throws Exception {
		return super.authenticationManager();
	}
	
	//Configuracoes de autenticacao
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(autenticacaoService).passwordEncoder(new BCryptPasswordEncoder());
	}
	
	//Configuracoes de autorizacao
	@Override
	protected void configure(HttpSecurity http) throws Exception {
//		http.csrf().disable().authorizeRequests()
//		.antMatchers(HttpMethod.POST,"/auth","http://localhost:8080/swagger-ui.html","/webjars/**", "/v2/api-docs", "/configuration/**")
//		.permitAll()
//		.anyRequest().authenticated()
//		.and().csrf().disable()
//		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//		.and().addFilterBefore(new AutenticacaoViaTokenFilter(tokenService, usuarioRepository), UsernamePasswordAuthenticationFilter.class);
//		  
		http.csrf().disable().
        authorizeRequests()
        .antMatchers(HttpMethod.POST,"/auth")
        .permitAll()
        .antMatchers("/v2/api-docs", "/configuration/**", "/swagger*/**", "/webjars/**","/ecommerce/produtos/*","/ecommerce/produtos")
        .permitAll()
        .anyRequest().authenticated().and()
        .sessionManagement()
        .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		http.headers().frameOptions().disable();
	}
	
	
	
	//Configuracoes de recursos estaticos(js, css, imagens, etc.)
	@Override
	public void configure(WebSecurity web) throws Exception {
	}
	
}
