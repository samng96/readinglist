package TeamLegendary.dataAccess;

import TeamLegendary.dataAccess.interfaces.DbRepo;

public class EchoRepo implements DbRepo {
    @Override public String echo(final String data) {
        return data;
    }
}
