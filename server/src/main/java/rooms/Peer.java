package rooms;

import utils.Address;

import java.util.Objects;

public final class Peer {
    private final String nickname;
    private final Address address;

    public Peer(String nickname, Address address) {
        this.nickname = nickname;
        this.address = address;
    }

    public String getNickname() {
        return nickname;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public int hashCode() {
        return nickname.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof Peer && ((Peer) other).nickname.equals(this.nickname);
    }
}
