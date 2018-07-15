package com.gokhantamkoc.personanlwebpage.backend.sessionservice.utility.slackbot;

import me.ramswaroop.jbot.core.common.JBot;
import me.ramswaroop.jbot.core.slack.Bot;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by Gokhan Tamkoc on 15.07.2018.
 */

@JBot
public class SlackBot extends Bot {

    @Value("${slackBotToken}")
    private String slackToken;

    @Override
    public String getSlackToken() {
        return this.slackToken;
    }

    @Override
    public Bot getSlackBot() {
        return this;
    }
}
