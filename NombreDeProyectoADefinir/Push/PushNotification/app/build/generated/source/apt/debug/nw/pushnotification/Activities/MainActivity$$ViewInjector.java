// Generated code from Butter Knife. Do not modify!
package nw.pushnotification.Activities;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class MainActivity$$ViewInjector {
  public static void inject(Finder finder, final nw.pushnotification.Activities.MainActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558463, "field 'startService' and method 'startService'");
    target.startService = (android.widget.Button) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.startService();
        }
      });
  }

  public static void reset(nw.pushnotification.Activities.MainActivity target) {
    target.startService = null;
  }
}
