package com.ma.bookticket.pojo;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

/**
 * @TableName trips
 */
@Data
@TableName(value = "trips")
public class Trips implements Serializable {
    /**
     * 编号
     *
     * @mbg.generated Sat Jan 23 21:36:14 CST 2021
     */
    @TableId(type = IdType.AUTO)
    private Integer trips_id;

    /**
     * 线路编号
     *
     * @mbg.generated Sat Jan 23 21:36:14 CST 2021
     */
    private Integer trips_line_id;

    /**
     * 列车名称
     *
     * @mbg.generated Sat Jan 23 21:36:14 CST 2021
     */
    private String trips_train_name;

    /**
     * 出发时间
     *
     * @mbg.generated Sat Jan 23 21:36:14 CST 2021
     */
    private Date trips_start_time;

    /**
     * 到达时间
     *
     * @mbg.generated Sat Jan 23 21:36:14 CST 2021
     */
    private Date trips_end_time;

    /**
     * 一等座剩余座位数量
     *
     * @mbg.generated Sat Jan 23 21:36:14 CST 2021
     */
    private Integer trips_first_seat_num;

    /**
     * 二等座剩余座位数量
     *
     * @mbg.generated Sat Jan 23 21:36:14 CST 2021
     */
    private Integer trips_second_seat_num;

    /**
     * 一等座票价
     *
     * @mbg.generated Sat Jan 23 21:36:14 CST 2021
     */
    private Float trips_first_seat_price;

    /**
     * 二等座票价
     *
     * @mbg.generated Sat Jan 23 21:36:14 CST 2021
     */
    private Float trips_second_seat_price;

    /**
     * 逻辑删除（0 未删除、1 删除）
     *
     * @mbg.generated Sat Jan 23 21:36:14 CST 2021
     */
    @TableLogic(value = "0", delval = "1")
    @TableField(fill = FieldFill.INSERT)
    private Integer trips_delete_flag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table trips
     *
     * @mbg.generated Sat Jan 23 21:36:14 CST 2021
     */
    //增加两个冗余属性（不在数据库中存在）
    @TableField(exist = false)
    private String trips_start_station_name;//起始站点名
    @TableField(exist = false)
    private String trips_end_station_name;//到达站点名
}
