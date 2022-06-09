package pl.tcs.po.models.blocks;

import pl.tcs.po.models.mobile.Vector2;
import pl.tcs.po.models.mobile.VectorRadial;
import pl.tcs.po.models.mobile.Vehicle;

public class EndBlock extends AbstractBlock{

    public EndBlock(Vector2 position, Rotation rotation) {
        super(position, rotation);
        setBiLink(Rotation.SOUTH, true);
        //receiveVehicle(inConnections.get(0), new Vehicle(getPosition()));

    }

    @Override
    public String getName() {
        return "end";
    }
}
