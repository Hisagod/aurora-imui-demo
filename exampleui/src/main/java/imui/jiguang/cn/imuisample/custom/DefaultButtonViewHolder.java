package imui.jiguang.cn.imuisample.custom;

import android.view.View;

import cn.jiguang.imui.commons.models.IMessage;

//用于创建ViewHolder所需对象
public class DefaultButtonViewHolder extends ButtonViewHolder<IMessage> {
    public DefaultButtonViewHolder(View itemView, boolean send) {
        super(itemView, send);
    }
}
