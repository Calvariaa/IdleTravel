package com.example.idletravel.format

import com.example.idletravel.gameCalender.GameCalendar

val formatPlayerStatusTextTwoLines: (List<Double>) -> String = { status ->
    String.format(
        " 力量: %.0f   体质: %.0f   灵巧: %.0f   感知: %.0f\n" +
                " 学识: %.0f   意志: %.0f   魔力: %.0f   魅力: %.0f",
        status[0], status[1], status[2], status[3], status[4], status[5], status[6], status[7]
    )
}


val formatPlayerStatusTextEightLines: (List<Double>) -> String = { status ->
    String.format(
        "力量:   %.2f\n体质:   %.2f\n灵巧:   %.2f\n感知:   %.2f\n" +
                "学识:   %.2f\n意志:   %.2f\n魔力:   %.2f\n魅力:   %.2f",
        status[0], status[1], status[2], status[3], status[4], status[5], status[6], status[7]
    )
}

val formatGameCalendarToTime: (GameCalendar) -> String = { gameCalendar ->
    String.format(
        ""+gameCalendar.year+"年 "+gameCalendar.getSeasonPhaseString()+gameCalendar.season
    )
}

const val informationBlank = "        "
// 段落开头的空格占位