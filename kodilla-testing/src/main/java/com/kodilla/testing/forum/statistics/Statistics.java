package com.kodilla.testing.forum.statistics;

import java.util.List;

interface Statistics {
    List<String> userNames();
    int postsCount();
    int commentsCount();
}
