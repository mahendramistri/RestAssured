package com.rest;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class Playlist {
    @JsonProperty("collobrative")
    private String name;
    @JsonProperty("vccxv")
    private String lastname;
    @JsonProperty("vccxv")
        private String id;
    @JsonProperty("vccxv")
        private double sal;

    public Playlist() {
    }

    public String getName() {
        return this.name;
    }

    public String getLastname() {
        return this.lastname;
    }

    public String getId() {
        return this.id;
    }

    public double getSal() {
        return this.sal;
    }

    @JsonProperty("collobrative")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("vccxv")
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @JsonProperty("vccxv")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("vccxv")
    public void setSal(double sal) {
        this.sal = sal;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Playlist)) return false;
        final Playlist other = (Playlist) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$lastname = this.getLastname();
        final Object other$lastname = other.getLastname();
        if (this$lastname == null ? other$lastname != null : !this$lastname.equals(other$lastname)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        if (Double.compare(this.getSal(), other.getSal()) != 0) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Playlist;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $lastname = this.getLastname();
        result = result * PRIME + ($lastname == null ? 43 : $lastname.hashCode());
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final long $sal = Double.doubleToLongBits(this.getSal());
        result = result * PRIME + (int) ($sal >>> 32 ^ $sal);
        return result;
    }

    public String toString() {
        return "Playlist(name=" + this.getName() + ", lastname=" + this.getLastname() + ", id=" + this.getId() + ", sal=" + this.getSal() + ")";
    }
}
