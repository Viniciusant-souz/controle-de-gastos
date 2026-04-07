package controledegastos.repository;

import controledegastos.model.Lancamento;  // ← ALTERAR PARA ESTE
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {
}