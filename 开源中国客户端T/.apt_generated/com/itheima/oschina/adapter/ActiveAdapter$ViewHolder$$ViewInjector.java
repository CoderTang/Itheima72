// Generated code from Butter Knife. Do not modify!
package com.itheima.oschina.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class ActiveAdapter$ViewHolder$$ViewInjector {
  public static void inject(Finder finder, final com.itheima.oschina.adapter.ActiveAdapter.ViewHolder target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131034220, "field 'actionName'");
    target.actionName = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131034224, "field 'pic'");
    target.pic = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131034226, "field 'commentCount'");
    target.commentCount = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131034222, "field 'lyReply'");
    target.lyReply = view;
    view = finder.findRequiredView(source, 2131034216, "field 'avatar'");
    target.avatar = (com.itheima.oschina.widget.AvatarView) view;
    view = finder.findRequiredView(source, 2131034217, "field 'name'");
    target.name = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131034225, "field 'from'");
    target.from = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131034221, "field 'body'");
    target.body = (com.itheima.oschina.widget.TweetTextView) view;
    view = finder.findRequiredView(source, 2131034219, "field 'action'");
    target.action = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131034223, "field 'reply'");
    target.reply = (com.itheima.oschina.widget.TweetTextView) view;
    view = finder.findRequiredView(source, 2131034211, "field 'time'");
    target.time = (android.widget.TextView) view;
  }

  public static void reset(com.itheima.oschina.adapter.ActiveAdapter.ViewHolder target) {
    target.actionName = null;
    target.pic = null;
    target.commentCount = null;
    target.lyReply = null;
    target.avatar = null;
    target.name = null;
    target.from = null;
    target.body = null;
    target.action = null;
    target.reply = null;
    target.time = null;
  }
}
