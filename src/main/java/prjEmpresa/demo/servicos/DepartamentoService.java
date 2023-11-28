package prjEmpresa.demo.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prjEmpresa.demo.entities.Departamento;
import prjEmpresa.demo.repository.DepartamentoRepository;

@Service
	public class DepartamentoService {

	private final DepartamentoRepository departamentoRepository;
	 
	    @Autowired
	    public DepartamentoService(DepartamentoRepository departamentoRepository) {
	        this.departamentoRepository = departamentoRepository;
	    }

	    public Departamento saveDepartamento(Departamento departamento) {
	        return departamentoRepository.save(departamento);
	    }

	    public Departamento getDepartamentoById(Long depcodigo) {
	        return departamentoRepository.findById(depcodigo).orElse(null);
	    }

	    public List<Departamento> getAllDepartamentos() {
	        return departamentoRepository.findAll();
	    }

	    public void deleteDepartamento(Long depcodigo) {
	    departamentoRepository.deleteById(depcodigo);
	    }

	}