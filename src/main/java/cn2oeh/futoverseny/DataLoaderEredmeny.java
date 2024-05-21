package cn2oeh.futoverseny;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import cn2oeh.futoverseny.model.Eredmeny;
import cn2oeh.futoverseny.repository.EredmenyRepository;

@Component
public class DataLoaderEredmeny implements CommandLineRunner {

    private final EredmenyRepository eredmenyRepository;

    @Autowired
    public DataLoaderEredmeny(EredmenyRepository eredmenyRepository) {
        this.eredmenyRepository = eredmenyRepository;
    }

    @Override
    public void run(String... args) {

        // add Eredmeny entities
        Eredmeny eredmeny1 = new Eredmeny();
        eredmeny1.setEredmenyVersenyName("Kis kör");
        eredmeny1.setEredmenyTime(110L);
        eredmeny1.setEredmenyFutoName("Emil");
        eredmenyRepository.save(eredmeny1);

        Eredmeny eredmeny2 = new Eredmeny();
        eredmeny2.setEredmenyVersenyName("Kis kör");
        eredmeny2.setEredmenyTime(130L);
        eredmeny2.setEredmenyFutoName("Ferkó");
        eredmenyRepository.save(eredmeny2);

        Eredmeny eredmeny3 = new Eredmeny();
        eredmeny3.setEredmenyVersenyName("Kis kör");
        eredmeny3.setEredmenyTime(150L);
        eredmeny3.setEredmenyFutoName("Gabi");
        eredmenyRepository.save(eredmeny3);

        Eredmeny eredmeny4 = new Eredmeny();
        eredmeny4.setEredmenyVersenyName("Nagy kör");
        eredmeny4.setEredmenyTime(330L);
        eredmeny4.setEredmenyFutoName("Gabi");
        eredmenyRepository.save(eredmeny4);

        Eredmeny eredmeny5 = new Eredmeny();
        eredmeny5.setEredmenyVersenyName("Nagy kör");
        eredmeny5.setEredmenyTime(300L);
        eredmeny5.setEredmenyFutoName("Andi");
        eredmenyRepository.save(eredmeny5);

        Eredmeny eredmeny6 = new Eredmeny();
        eredmeny6.setEredmenyVersenyName("Nagy kör");
        eredmeny6.setEredmenyTime(320L);
        eredmeny6.setEredmenyFutoName("Peti");
        eredmenyRepository.save(eredmeny6);
    }
}