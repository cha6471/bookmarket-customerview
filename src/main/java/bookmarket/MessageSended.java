package bookmarket;

public class MessageSended extends AbstractEvent {

    private Long id;
    private Long deliveryId;
    private Long messageId;

    public Long getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Long deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getBookMessage() {
        return bookMessage;
    }

    public void setBookMessage(String bookMessage) {
        this.bookMessage = bookMessage;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    private String bookMessage;
    private String deliveryStatus;


    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
