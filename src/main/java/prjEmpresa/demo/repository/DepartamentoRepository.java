package prjEmpresa.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import prjEmpresa.demo.entities.Departamento;

public interface DepartamentoRepository extends JpaRepository <Departamento, Long> { 

}

