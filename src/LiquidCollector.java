public class LiquidCollector implements WasteCollector {
    private WasteCollector nextCollector;

    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    @Override
    public void processWaste(WasteContainer container) {
        if (container.getType().equals("liquid")) {
            System.out.println(">> Liquid Waste Collector: Filtering " + container.getCapacity() + " liters of liquid waste.");
        } else if (nextCollector != null) {
            nextCollector.processWaste(container);
        } else {
            System.out.println("No collector found for " + container.getType().toUpperCase() + " WASTE.");
        }
    }
}