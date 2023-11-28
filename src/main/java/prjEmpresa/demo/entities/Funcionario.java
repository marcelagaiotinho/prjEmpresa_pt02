package prjEmpresa.demo.entities;

	import java.time.LocalDate;

import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
		
		@Entity
		@Table(name = "tb_funcionario")
		public class Funcionario {

			@ManyToOne
			private Departamento departamento;
			
			@Id
			@GeneratedValue(strategy = GenerationType.AUTO)
			private Long funcodigo;

			private String funnome;
			
			private LocalDate funnascimento;
			
			private double funsalario;

			public Long getFuncodigo() {
				return funcodigo;
			}

			public void setFuncodigo(Long funcodigo) {
				this.funcodigo = funcodigo;
			}

			public String getFunnome() {
				return funnome;
			}

			public void setFunnome(String funnome) {
				this.funnome = funnome;
			}

			public LocalDate getFunnascimento() {
				return funnascimento;
			}

			public void setFunnascimento(LocalDate funnascimento) {
				this.funnascimento = funnascimento;
			}

			public double getFunsalario() {
				return funsalario;
			}

			public void setFunsalario(double funsalario) {
				this.funsalario = funsalario;
			}
			
			public Departamento getDepartamento() {
				return departamento;
			}

			public void setDepartamento(Departamento departamento) {
				this.departamento = departamento;
			}
			

}
