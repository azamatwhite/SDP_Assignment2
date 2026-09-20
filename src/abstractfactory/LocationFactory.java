package abstractfactory;

public interface LocationFactory {
    Champion createChampion();
    Defence createDefence();
    Terrain createTerrain();
}
