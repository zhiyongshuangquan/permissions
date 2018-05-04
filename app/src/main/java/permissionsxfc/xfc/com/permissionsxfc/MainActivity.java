package permissionsxfc.xfc.com.permissionsxfc;

import android.Manifest;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends BasePermissionActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 写SD卡
     *
     * @param view
     */
    public void getSdperssion(View view) {
        requestPermission(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 0);
    }

    @Override
    public void permissionSuccess(int requestCode) {
        super.permissionSuccess(requestCode);
        switch (requestCode) {
            case 0:
                Toast.makeText(MainActivity.this, "SD权限获取成功", Toast.LENGTH_LONG).show();
                break;
        }
    }

    @Override
    public void permissionFail(int requestCode) {
        super.permissionFail(requestCode);
        switch (requestCode) {
            case 0:
                Toast.makeText(MainActivity.this, "SD权限获取失败", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
