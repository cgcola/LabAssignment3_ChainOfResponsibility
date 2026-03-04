public class OrganicCollector implements WasteCollector {
    private WasteCollector nextCollector;

    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    @Override
    public void processWaste(WasteContainer container) {
        if (container.getType().equals("organic")) {
            System.out.println(">> Organic Waste Collector: Composting " + container.getCapacity() + "kg of waste.");
        } else if (nextCollector != null) {
            nextCollector.processWaste(container);
        } else {
            System.out.println("No collector found for " + container.getType().toUpperCase() + " WASTE.");
        }
    }
}