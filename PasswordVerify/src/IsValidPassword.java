import java.util.Objects;

public class IsValidPassword {
    private boolean isValidPassword;
    private String msg;

    public IsValidPassword(boolean isValidPassword, String msg) {
        this.isValidPassword = isValidPassword;
        this.msg = msg;
    }

    public boolean isValidPassword() {
        return isValidPassword;
    }

    public void setValidPassword(boolean validPassword) {
        isValidPassword = validPassword;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IsValidPassword that = (IsValidPassword) o;
        return isValidPassword == that.isValidPassword && Objects.equals(msg, that.msg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isValidPassword, msg);
    }

    @Override
    public String toString() {
        return msg;
    }
}
