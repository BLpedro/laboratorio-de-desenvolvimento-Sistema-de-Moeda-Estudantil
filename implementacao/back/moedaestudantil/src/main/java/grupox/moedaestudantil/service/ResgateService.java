    package grupox.moedaestudantil.service;

    import java.util.List;

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

    import grupox.moedaestudantil.entity.Resgate;
    import grupox.moedaestudantil.repository.ResgateRepository;

    @Service
    public class ResgateService {

        @Autowired
        private ResgateRepository resgateRepository;

        public Resgate createResgate(Resgate resgate) {
            return resgateRepository.save(resgate);
        }

        public Resgate updateResgate(Long id, Resgate updateResgates){
            return resgateRepository.findById(id)
            .map(resgate -> {
                resgate.setAlunoId(updateResgates.getAlunoId());
                resgate.setProfessorId(updateResgates.getProfessorId());
                resgate.setVantagemId(updateResgates.getVantagemId());
                resgate.setTipo(updateResgates.getTipo());
                resgate.setDescricao(updateResgates.getDescricao());
                resgate.setValor(updateResgates.getValor());
                resgate.setData(updateResgates.getData());
                return resgateRepository.save(resgate);
    }).orElseThrow(() -> new RuntimeException("Instituição não encontrada"));
        }


        public void deleteResgate(Long id) {
            resgateRepository.deleteById(id);
        }

        public Resgate getResgateById(Long id) {
            return resgateRepository.findById(id).orElse(null);
        }

        public List<Resgate> getAllResgates() {
            return resgateRepository.findAll();
        }
    }
