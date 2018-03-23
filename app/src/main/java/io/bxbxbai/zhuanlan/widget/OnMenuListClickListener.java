package io.bxbxbai.zhuanlan.widget;

import android.app.Activity;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.widget.AdapterView;

import io.bxbxbai.common.Tips;
import io.bxbxbai.zhuanlan.R;
import io.bxbxbai.zhuanlan.ui.AllPeopleActivity;
import io.bxbxbai.zhuanlan.ui.RecentPostListActivity;

/**
 *
 * 点击事件
 * @author bxbxbai
 */
public class OnMenuListClickListener implements AdapterView.OnItemClickListener {

    private Activity mActivity;
    private DrawerLayout mDrawerLayout;

    public OnMenuListClickListener(Activity activity, DrawerLayout drawerLayout) {
        mActivity = activity;
        mDrawerLayout = drawerLayout;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        DrawerMenuContent.DrawerItem item = (DrawerMenuContent.DrawerItem) view.getTag(R.id.key_data);

        if (mDrawerLayout != null && mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
            mDrawerLayout.closeDrawers();
        }

        switch (item.id) {
            case R.id.menu_search :
                Tips.showToast("Coming soon...");
                break;

            case R.id.menu_all_people:
                AllPeopleActivity.start(mActivity);
                break;

            case R.id.menu_recent_news :
                RecentPostListActivity.start(mActivity);
                break;

            default:break;
        }
    }
}
