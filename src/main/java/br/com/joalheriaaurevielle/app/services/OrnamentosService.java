package br.com.joalheriaaurevielle.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriaaurevielle.app.entities.Ornamentos;
import br.com.joalheriaaurevielle.app.repositories.OrnamentosRepository;

@Service
public class OrnamentosService {
    
    @Autowired
    private OrnamentosRepository ornamentosRepository;
    
    public Ornamentos saveOrnamentos(Ornamentos ornamentos) {
        return ornamentosRepository.save(ornamentos);
    }
    
    public List<Ornamentos> getAllOrnamentos() {
        return ornamentosRepository.findAll();
    }
    
    public Ornamentos getOrnamentosById(Long id) {
        return ornamentosRepository.findById(id).orElse(null);
    }
    
    public void deleteOrnamentos(Long id) {
        ornamentosRepository.deleteById(id);
    }
}