package automatKomorkowy.DwoDimension.ziarna.ZiarnoNeighGetter.Export;

import automatKomorkowy.DwoDimension.ziarna.Ziarno;
import automatKomorkowy.DwoDimension.ziarna.ZiarnoNeighGetter.ZiarnoNeighGetterHelper;
import automatKomorkowy.DwoDimension.ziarna.ZiarnoNeighGetter.ZiarnoNeighGetterIf;

/**
 * Created by Lach on 2017-05-12.
 */
public class ZiarnoMooreneighGetter implements ZiarnoNeighGetterIf {

    @Override
    public Ziarno[] GetNeigh(Ziarno[][] tab, int x, int y,boolean crossBorders) {
        int[][] neigh = {{1,0},{0,1},{0,-1},{-1,0},{-1,1},{1,1},{-1,-1},{1,-1}};
        return ZiarnoNeighGetterHelper.GetZiarnosWithOffset(tab,x,y,neigh,crossBorders);
    }
}
