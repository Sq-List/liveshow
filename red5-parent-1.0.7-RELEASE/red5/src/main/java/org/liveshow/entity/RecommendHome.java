package org.liveshow.entity;

public class RecommendHome {
    private Integer id;

    private Integer roomId;

    private Integer time;

    private Integer managerId;

    public RecommendHome(Integer id, Integer roomId, Integer time, Integer managerId) {
        this.id = id;
        this.roomId = roomId;
        this.time = time;
        this.managerId = managerId;
    }

    public RecommendHome() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }
}