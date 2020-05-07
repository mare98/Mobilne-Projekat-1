package rs.raf.projekat1.marko_vesovic_rn2417.view.recycler.diff

import androidx.recyclerview.widget.DiffUtil
import rs.raf.projekat1.marko_vesovic_rn2417.model.Patient

class PatientDiffItemCallback : DiffUtil.ItemCallback<Patient>() {
    override fun areItemsTheSame(oldItem: Patient, newItem: Patient): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Patient, newItem: Patient): Boolean {
        return oldItem.id == newItem.id &&
                oldItem.name == newItem.name &&
                oldItem.lastName == newItem.lastName &&
                oldItem.symptoms == newItem.symptoms
    }
}