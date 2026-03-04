public interface WasteCollector {
    void setNextCollector(WasteCollector nextCollector);
    void processWaste(WasteContainer container);
}
