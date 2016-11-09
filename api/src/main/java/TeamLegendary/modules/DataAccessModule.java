package TeamLegendary.modules;

import com.google.inject.AbstractModule;
import TeamLegendary.dataAccess.EchoRepo;
import TeamLegendary.dataAccess.interfaces.DbRepo;

public class DataAccessModule extends AbstractModule {

    @Override protected void configure() {
        bind(DbRepo.class).to(EchoRepo.class);
    }
}
