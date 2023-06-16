package co.edu.poli.Examenfinal.services;

import co.edu.poli.Examenfinal.persistence.entity.Secuencia;
import co.edu.poli.Examenfinal.persistence.repository.SecuenciaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SecuenciaServiceImpl implements SecuenciaService{

    private final SecuenciaRepository secuenciaRepository;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(Secuencia secuencia) {
        secuenciaRepository.save(secuencia);
    }
}
