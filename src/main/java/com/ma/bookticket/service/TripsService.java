package com.ma.bookticket.service;

import com.ma.bookticket.pojo.Trips;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 提供车次操作相关接口方法
 * @author yong
 * @date 2021/1/21 15:45
 */
@Service
public interface TripsService {

    /**
     * 根据线路id和出发日期获得该车次
     * @param line_id 线路id
     * @param start_date 出发日期
     * @author yong
     * @date 2021/1/21 17:48
     * @return java.util.List<com.ma.bookticket.pojo.Trips>
     */
    public List<Trips> getSomeTrips(int line_id, Date start_date);

    /**
     * 通过车次编号查找获取车次信息(忽略已逻辑删除的行)
     * @param trips_id 车次编号
     * @author yong
     * @date 2021/1/23 22:24
     * @return com.ma.bookticket.pojo.Trips
     */

    public Trips getOneById(int trips_id);

    /**
     * 减少该车次一等座的车票数量，考虑超卖的问题
     * @param trips_id 车次编号
     * @author yong
     * @date 2021/1/24 22:52
     * @return int
     */
    public int decrease_first_seatnum(int trips_id);
    /**
     * 减少该车次二等座的数量，考虑超卖的问题
     * @param trips_id 车次编号
     * @author yong
     * @date 2021/1/24 22:52
     * @return int
     */
    public int decrease_second_seatnum(int trips_id);

    /**
     * 用于退票改签操作使原车次的一等座座位数量+1
     *
     * @param trips_id 车次编号
     * @author yong
     * @date 2021/2/9 20:18
     * @return int
     */
    public int increase_first_seatnum(int trips_id);

    /**
     * 用于退票改签操作使原车次的二等坐座位数量+1
     *
     * @param trips_id 车次编号
     * @author yong
     * @date 2021/2/9 20:18
     * @return int
     */
    public int increase_secnd_seatnum(int trips_id);

    /**
     * 查找特定线路编号和坐席级别相应座位数量大于0，且发车时间大于现在的车次，用于改签选择
     *
     * @param order_id 订单编号
     * @author yong
     * @date 2021/1/28 16:02
     * @return java.util.List<com.ma.bookticket.pojo.Trips>
     */
    public List<Trips> getChangingTrips(int order_id);

    /**
     *
     * 对超过发车日期的车次进行逻辑删除
     * @author yong
     * @date 2021/1/29 17:43
     * @return int
     */
    public int deleteEveryDay();
}
