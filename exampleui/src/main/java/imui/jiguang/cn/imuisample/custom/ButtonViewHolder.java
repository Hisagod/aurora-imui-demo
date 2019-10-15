package imui.jiguang.cn.imuisample.custom;

import android.view.View;
import android.widget.Button;

import cn.jiguang.imui.commons.models.IMessage;
import cn.jiguang.imui.messages.BaseMessageViewHolder;
import cn.jiguang.imui.messages.MessageListStyle;
import cn.jiguang.imui.messages.MsgListAdapter;
import imui.jiguang.cn.imuisample.R;

public class ButtonViewHolder<A extends IMessage> extends BaseMessageViewHolder<A> implements MsgListAdapter.DefaultMessageViewHolder {

    private final Button btn;

    @Override
    public void onBind(A a) {
        btn.setText(a.getText());
    }

    public ButtonViewHolder(View itemView, boolean send) {
        super(itemView);

        btn = itemView.findViewById(R.id.btn);
    }

    @Override
    public void applyStyle(MessageListStyle style) {

    }
}
