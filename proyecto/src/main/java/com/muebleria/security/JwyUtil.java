// package com.muebleria.proyecto.security;

// import java.io.IOException;
// import java.util.Calendar;
// import java.util.Date;



// import javax.naming.AuthenticationException;



// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.stereotype.Component;



// import com.auth0.jwt.JWT;
// import com.auth0.jwt.JWTVerifier;
// import com.auth0.jwt.algorithms.Algorithm;
// import com.auth0.jwt.exceptions.JWTCreationException;
// import com.auth0.jwt.exceptions.JWTVerificationException;
// import com.auth0.jwt.interfaces.DecodedJWT;
// import com.fasterxml.jackson.core.JsonProcessingException;
// import com.fasterxml.jackson.databind.ObjectMapper;



// @Component
// public class JwtUtil {



// private static final Logger logger = LoggerFactory.getLogger(JwtUtil.class);



// @Value("${security.secret.key}")
// private String key;



// public String generateJwt(Usuario user) throws Exception {
// ObjectMapper mapper = new ObjectMapper();
// Calendar calendar = Calendar.getInstance();
// Date now = calendar.getTime();
// calendar.add(Calendar.HOUR, 8);
// Date expiration = calendar.getTime();
// try {
// String jsonInString = mapper.writeValueAsString(user);
// Algorithm algorithm = Algorithm.HMAC256(key);
// String token = JWT.create().withIssuer("auth0").withIssuedAt(now).withExpiresAt(expiration)
// .withSubject(jsonInString).sign(algorithm);
// return token;
// } catch (JWTCreationException | IllegalArgumentException | JsonProcessingException exception) {
// logger.error(exception.getMessage());
// throw generateException("Error al generar Token", exception);
// }
// }



// public Usuario validateToken(String auth) throws AuthenticationException {
// if (auth == null || auth.equals("") || !auth.contains(" ")) {
// throw new AuthenticationException();
// }
// String token = auth.split(" ")[1];
// ObjectMapper mapper = new ObjectMapper();
// try {
// Algorithm algorithm = Algorithm.HMAC256(key);
// JWTVerifier verifier = JWT.require(algorithm).withIssuer("auth0").build();
// DecodedJWT jwt = verifier.verify(token);
// String json = jwt.getSubject();
// Usuario user = mapper.readValue(json, Usuario.class);
// return user;
// } catch (JWTVerificationException | IllegalArgumentException | IOException exception) {
// logger.error(exception.getMessage());
// throw generateException("Su sesión ha expirado, token inválido", exception);
// }
// }



// private AuthenticationException generateException(String message, Exception exception) {
// AuthenticationException authenticationException = new AuthenticationException(message);
// authenticationException.initCause(exception.getCause());
// return authenticationException;
// }
// }