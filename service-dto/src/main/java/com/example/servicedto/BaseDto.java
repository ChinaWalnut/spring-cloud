package com.example.servicedto;

/**
 * dto基类
 *
 * @author HT
 * @date 2018 -01-16 16:12:17
 */
public abstract class BaseDto {

    /**
     * The Id.
     */
    private Long id;
    /**
     * The Create time.
     */
    private Long createTime;

    /**
     * Instantiates a new Base dto.
     */
    public BaseDto() {
    }

    /**
     * Gets id.
     *
     * @return the id
     * @author HT
     * @date 2018 -01-16 16:12:17
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     * @author HT
     * @date 2018 -01-16 16:12:17
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets create time.
     *
     * @return the create time
     * @author HT
     * @date 2018 -01-16 16:12:17
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * Sets create time.
     *
     * @param createTime the create time
     * @author HT
     * @date 2018 -01-16 16:12:17
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}
