package org.br.senai.sc.ecommerce.seguranca;

import java.util.HashSet;
import java.util.Set;

import org.br.senai.sc.ecommerce.seguranca.dominio.Usuario;
import org.br.senai.sc.ecommerce.seguranca.dominio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	private UsuarioRepositorio usuarioRepo;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usuarioRepo.findByUsername(username);
		
		if (usuario != null) {
			SimpleGrantedAuthority authority = new SimpleGrantedAuthority(usuario.getRole());
			Set<GrantedAuthority> authorities = new HashSet<>();
			authorities.add(authority);
			User user = new User(usuario.getUsername(), usuario.getPassword(), authorities);
			return user;
		}
		
		
		return null;
	}

	}

