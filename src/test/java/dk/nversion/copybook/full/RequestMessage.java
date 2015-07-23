package dk.nversion.copybook.full;

import dk.nversion.copybook.*;

@CopyBook()
@CopyBookFieldFormat(fieldType = CopyBookFieldType.INT, rightPadding = true, paddingChar = '0', signingPostfix = false)
@CopyBookFieldFormat(fieldType = CopyBookFieldType.STRING, rightPadding = true, paddingChar = ' ',  signingPostfix = false)
public class RequestMessage {
    @CopyBookLine("02 TITLE PIC X(5).")
    public String title;
    @CopyBookFieldFormat(fieldType = CopyBookFieldType.STRING, rightPadding = false, paddingChar = '_', signingPostfix = false)
    @CopyBookLine("02 BODY PIC X(10).")
    public String body;

    public RequestMessage() {
    }

    public RequestMessage(String title, String body) {
        this.title = title;
        this.body = body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RequestMessage that = (RequestMessage) o;

        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        return !(body != null ? !body.equals(that.body) : that.body != null);

    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (body != null ? body.hashCode() : 0);
        return result;
    }
}