public class HazardousCollector implements WasteCollector {
    private WasteCollector nextCollector;

    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    @Override
    public void processWaste(WasteContainer container) {
        if (container.getType().equals("hazardous")) {
            System.out.println(">> Hazardous Waste Collector: Neutralizing " + container.getCapacity() + "kg of toxins.");
        } else if (nextCollector != null) {
            nextCollector.processWaste(container);
        } else {
            System.out.println("No collector found for " + container.getType().toUpperCase() + " WASTE.");
        }
    }
}