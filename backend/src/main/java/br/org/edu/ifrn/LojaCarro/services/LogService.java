package br.org.edu.ifrn.LojaCarro.services;


import br.org.edu.ifrn.LojaCarro.model.Log;
import br.org.edu.ifrn.LojaCarro.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;

@Service
public class LogService {

    @Autowired
    private LogRepository logRepository;

    public void registarLog(LocalDate dataOperacao, String operacaoRealizada, Long idUsuario) {
        Log log = new Log(dataOperacao, operacaoRealizada,idUsuario);

        logRepository.save(log);
    }
}
