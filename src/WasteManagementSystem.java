public class WasteManagementSystem {
    public static void main(String[] args) {
        WasteCollector organic = new OrganicCollector();
        WasteCollector recyclable = new RecyclableCollector();
        WasteCollector hazardous = new HazardousCollector();
        WasteCollector electronic = new ElectronicCollector();
        WasteCollector liquid = new LiquidCollector();

        organic.setNextCollector(recyclable);
        recyclable.setNextCollector(hazardous);
        hazardous.setNextCollector(electronic);
        electronic.setNextCollector(liquid);

        WasteContainer[] containers = {
            new WasteContainer("Organic", 15),
            new WasteContainer("Recyclable", 40),
            new WasteContainer("Hazardous", 5),
            new WasteContainer("Electronic", 10),
            new WasteContainer("Liquid", 25),
            new WasteContainer("Medical", 0)
        };

        System.out.println("--- Automated Waste Management System\n");

        for (WasteContainer container : containers) {
            System.out.println("Processing: " + container.getType().toUpperCase() + " WASTE");
            organic.processWaste(container);
            System.out.print("\n");
        }
    }
}