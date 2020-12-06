package br.com.gabrielmorais.aplicativodemonstracao.adapter;/*
 **
 **
 **  Create by
 **  gabrielmorais
 **  AplicativoDemonstracao
 **  05/12/2020
 **
 **
 */

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import br.com.gabrielmorais.aplicativodemonstracao.fragments.ProdutosFragment;

public class ScreenSlidePagerAdapter extends FragmentStateAdapter {

    public ScreenSlidePagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return new ProdutosFragment();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
