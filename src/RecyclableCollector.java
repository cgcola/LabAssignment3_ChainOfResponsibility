public class RecyclableCollector implements WasteCollector {
    private WasteCollector nextCollector;

    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    @Override
    public void processWaste(WasteContainer container) {
        if (container.getType().equals("recyclable")) {
            System.out.println(">> Recyclable Waste Collector: Sorting " + container.getCapacity() + "kg of materials.");
        } else if (nextCollector != null) {
            nextCollector.processWaste(container);
        } else {
            System.out.println("No collector found for " + container.getType().toUpperCase() + " WASTE.");
        }
    }
}