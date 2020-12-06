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

import br.com.gabrielmorais.aplicativodemonstracao.R;

public class PerfilUsuarioFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.perfil_usuario_fragment, container, false);
        return view;
    }
}
