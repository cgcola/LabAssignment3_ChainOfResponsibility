public class ElectronicCollector implements WasteCollector {
    private WasteCollector nextCollector;

    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    @Override
    public void processWaste(WasteContainer container) {
        if (container.getType().equals("electronic")) {
            System.out.println(">> Electronic Waste Collector: Recycling " + container.getCapacity() + " units of e-waste.");
        } else if (nextCollector != null) {
            nextCollector.processWaste(container);
        } else {
            System.out.println("No collector found for " + container.getType().toUpperCase() + " WASTE.");
        }
    }
}