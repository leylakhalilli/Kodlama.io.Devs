package com.example.programminglanguage.business.concretes;

import com.example.programminglanguage.business.abstracts.ProgrammingLanguageService;
import com.example.programminglanguage.dataAccess.abstracts.ProgrammingLanguageRepository;
import com.example.programminglanguage.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
    private ProgrammingLanguageRepository languageRepository;

    @Autowired
    public ProgrammingLanguageManager(ProgrammingLanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return languageRepository.getAll();
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        languageRepository.add(programmingLanguage);
    }

    @Override
    public void delete(int id) {
        languageRepository.delete(id);

    }

    @Override
    public void update(int id, ProgrammingLanguage programmingLanguage) {
        languageRepository.update(id, programmingLanguage);
    }

    @Override
    public ProgrammingLanguage getLanguageById(int id) {
        return languageRepository.getLanguageById(id);
    }
}
