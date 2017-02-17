package com.bmkit.util;


public class ChartUtil {

    /**
     * 生成AnyChart图表
     *
     * @return
     */

    public static String lineChart(Double value1, Double value2) {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>")
                .append("<anychart>").append("<margin all=\"-10\"/>");
        sb.append("<settings>").append("<animation enabled=\"true\"/>")
                .append("</settings>");
        sb.append("<gauges>").append("<gauge>");
        sb.append("<chart_settings>")
                .append("<title enabled=\"true\">")
                .append("<text><![CDATA[用户总空间")
                .append(value2)
                .append("GB]]></text>")
                .append("<font color=\"#aaf4ff\" size=\"12\" bold=\"false\"/>")
                .append("</title>")
                .append("<chart_background enabled=\"true\">")
                .append("<fill enabled=\"true\" type=\"Image\" image_url=\"../../static/img/gj_lefts.gif\" image_mode=\"Tile\"/>")
                .append("<border enabled=\"false\"/>")
                .append("<corners type=\"Square\" />")
                .append("</chart_background>")
                .append("</chart_settings>");
        sb.append("<linear orientation=\"Horizontal\">")
                .append("<margin all=\"10\"/>")
                .append("<axis enabled=\"false\" size=\"30\" position=\"20\">")
                .append("<scale_bar enabled=\"false\"/>")
                .append("<major_tickmark length=\"3\"/>")
                .append("<labels>")
                .append("<format><![CDATA[{%Value}{numDecimals:0}%]]></format>")
                .append("</labels>")
                .append("</axis>");
        sb.append("<pointers>")
                .append("<pointer type=\"Tank\" value=\"")
                .append(value1)
                .append("\" color=\"Cyan\">")
                .append("<label enabled=\"true\">")
                .append("<position placement_mode=\"ByAnchor\" anchor=\"Center\" padding=\"15\" valign=\"Bottom\" halign=\"Center\"/>")
                .append("<format><![CDATA[已使用：{%Value}{numDecimals:1}%]]></format>")
                .append("<font color=\"#aaf4ff\" size=\"10\" bold=\"false\"/>")
                .append("<background enabled=\"false\"/>")
                .append("</label>")
                .append("<animation enabled=\"true\" start_time=\"0\" duration=\"0.4\" interpolation_type=\"Cubic\"/>")
                .append("</pointer>")
                .append("</pointers>")
                .append("</linear>")
                .append("</gauge>")
                .append("</gauges>")
                .append("</anychart>");
        return sb.toString();
    }
}
