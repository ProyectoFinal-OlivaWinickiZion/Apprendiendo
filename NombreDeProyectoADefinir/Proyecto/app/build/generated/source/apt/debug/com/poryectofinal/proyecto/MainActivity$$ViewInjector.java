// Generated code from Butter Knife. Do not modify!
package com.poryectofinal.proyecto;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class MainActivity$$ViewInjector {
  public static void inject(Finder finder, final com.poryectofinal.proyecto.MainActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558551, "field 'startService' and method 'startService'");
    target.startService = (android.widget.ImageButton) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.startService();
        }
      });
  }

  public static void reset(com.poryectofinal.proyecto.MainActivity target) {
    target.startService = null;
  }
}
