package springbootpackage.service;

import springbootpackage.model.Cell;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
    import java.util.List;

@Service
public class StackoverflowService{

    private static List<Cell> items = new ArrayList<>();
    static {

        items.add(new Cell(0, 0, true,
                3));
        items.add(new Cell(1,0, true,
                3));
        items.add(new Cell(0,1, true,
                3));
    }


    public List<Cell> returnFirstGeneration() {
        return items;
    }

}

