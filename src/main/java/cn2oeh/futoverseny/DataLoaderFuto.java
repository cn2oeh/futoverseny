package cn2oeh.futoverseny;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import cn2oeh.futoverseny.model.Futo;
import cn2oeh.futoverseny.repository.FutoRepository;

@Component
public class DataLoaderFuto implements CommandLineRunner {

    private final FutoRepository futoRepository;

    @Autowired
    public DataLoaderFuto(FutoRepository futoRepository) {
        this.futoRepository = futoRepository;
    }

    @Override
    public void run(String... args) {

        // add Futo entities
        Futo futo = new Futo();
        futo.setFutoName("Emil");
        futo.setFutoAge(49);
        futo.setFutoSex("fiú");
        futoRepository.save(futo);

        Futo futo2 = new Futo();
        futo2.setFutoName("Ferkó");
        futo2.setFutoAge(46);
        futo2.setFutoSex("fiú");
        futoRepository.save(futo2);

        Futo futo3 = new Futo();
        futo3.setFutoName("Andi");
        futo3.setFutoAge(45);
        futo3.setFutoSex("lány");
        futoRepository.save(futo3);

        Futo futo4 = new Futo();
        futo4.setFutoName("Gabi");
        futo4.setFutoAge(35);
        futo4.setFutoSex("lány");
        futoRepository.save(futo4);

        Futo futo5 = new Futo();
        futo5.setFutoName("Peti");
        futo5.setFutoAge(40);
        futo5.setFutoSex("fiú");
        futoRepository.save(futo5);
    }
}