package br.com.gabrielmorais.aplicativodemonstracao.fragments;/*
 **
 **
 **  Create by
 **  gabrielmorais
 **  AplicativoDemonstracao
 **  05/12/2020
 **
 **
 */

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import br.com.gabrielmorais.aplicativodemonstracao.R;
import br.com.gabrielmorais.aplicativodemonstracao.adapter.ScreenSlidePagerAdapter;

public class CatalogoProdutosFragment extends Fragment {


    ViewPager2 pager;
    FragmentStateAdapter pagerAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.catalogo_fragment, container, false );
        pager = view.findViewById( R.id.pager2 );
        pagerAdapter = new ScreenSlidePagerAdapter( this );
        pager.setAdapter( pagerAdapter );

        return view;
    }
}
