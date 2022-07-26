package org.br.senai.sc.ecommerce.comercial.dominio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepositorio extends JpaRepository<Departamento, Long> {

}
