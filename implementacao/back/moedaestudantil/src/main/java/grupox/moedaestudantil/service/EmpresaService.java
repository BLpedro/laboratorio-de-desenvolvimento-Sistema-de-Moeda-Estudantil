package grupox.moedaestudantil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import grupox.moedaestudantil.entity.Empresa;
import grupox.moedaestudantil.repository.EmpresaRepository;


@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;


    public Empresa createEmpresa(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

public Empresa updateEmpresa(Long id, Empresa updateEmpresa) {
        return empresaRepository.findById(id)
            .map(empresa -> {
                empresa.setNome(updateEmpresa.getNome());
                empresa.setCnpj(updateEmpresa.getCnpj());
                return empresaRepository.save(empresa);
            }).orElseThrow(() -> new RuntimeException("Empresa não encontrada"));
    }

    public void deleteEmpresa(Long id) {
        empresaRepository.deleteById(id);
    }

    public Empresa getEmpresaById(Long id) {
        return empresaRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Empresa não encontrada"));
    }

    public List<Empresa> getAllEmpresas() {
        return empresaRepository.findAll();
    }




    
}