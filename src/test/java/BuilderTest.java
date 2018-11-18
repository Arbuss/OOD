import builder.Computer;
import builder.NotebookBuilder;
import builder.PersonalComputerBuilder;
import director.Director;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class BuilderTest {

    @Test
    public void pcBuilderTest(){
        Computer comp = new Computer("cpu", "gpu", "motherboard", "PC", 8);
        PersonalComputerBuilder pcb = new PersonalComputerBuilder();

        pcb.create();
        pcb.setMotherboard("motherboard");
        pcb.setCPU("cpu");
        pcb.setGPU("gpu");
        pcb.setRAM(8);

        assertEquals(comp, pcb.getComputer());
    }

    @Test
    public void notebookBuilderTest(){
        Computer comp = new Computer("cpu", "gpu", "motherboard", "Notebook", 8);
        NotebookBuilder nb = new NotebookBuilder();

        nb.create();
        nb.setMotherboard("motherboard");
        nb.setCPU("cpu");
        nb.setGPU("gpu");
        nb.setRAM(8);

        assertEquals(comp, nb.getComputer());
    }

    @Test
    public void directorTest(){
        Computer comp = new Computer("phenom x2", "rx 270", "am1", "PC", 1);
        PersonalComputerBuilder pcb = new PersonalComputerBuilder();
        Director director = new Director();

        assertEquals(comp, director.constructWeakPC(pcb));
    }
}
